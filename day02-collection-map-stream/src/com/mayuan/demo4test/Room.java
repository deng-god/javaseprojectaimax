package com.mayuan.demo4test;

import java.util.*;

public class Room {

    //住呢比54张牌，给房间使用
    private List<Card> cards = new ArrayList<>();

    //初始化54张牌
    {
        String[] sizes = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] colors = {"♥", "♠", "♣", "♦"};
        //组合点数和花色
        int num = 0;
        for (String size : sizes) {
            num++;
            for (String color : colors) {
                cards.add(new Card(size, color, num));
            }
        }
//        cards.add(new Card("","JOKER"));
//        cards.add(new Card("","BossJOKER"));
        Collections.addAll(cards, new Card("", "JOKER", ++num), new Card("", "BossJOKER", ++num));

        System.out.println(cards);

    }

    public void start() {
        //洗牌
        Collections.shuffle(cards);
        System.out.println("洗牌后" + cards);

        //发牌，创建三个玩家
        Map<String, List<Card>> players = new HashMap<>();

        List<Card> lhc = new ArrayList<>();
        players.put("令狐冲 ", lhc);

        List<Card> lhb = new ArrayList<>();
        players.put("令狐白", lhb);

        List<Card> lhz = new ArrayList<>();
        players.put("令狐紫", lhz);
//        players.put("令狐紫",new ArrayList<>());

        //allCards = 54
        //只发出去51张牌
        for (int i = 0; i < cards.size() - 3; i++) {
            Card card = cards.get(i);
            if (i % 3 == 0) {
                //令狐冲接牌
                lhc.add(card);
            } else if (i % 3 == 1) {
                //令狐白接牌
                lhb.add(card);
            } else {
                //令狐紫接牌
                lhz.add(card);
            }
        }

        //那最后三张底牌
        List<Card> lastCards = cards.subList(cards.size() - 3, cards.size());
        System.out.println("底牌:" + lastCards);

        //对牌排序
        sortCards(lhc);
        sortCards(lhb);
        sortCards(lhz);


        //看牌，遍历Map集合
        for (Map.Entry<String, List<Card>> entry : players.entrySet()) {
            //获取玩家姓名
            String name = entry.getKey();
            //获取玩家牌
            List<Card> cards = entry.getValue();
            //遍历玩家手牌
            System.out.println(name + ":" + cards);
        }
    }

    private void sortCards(List<Card> cards) {
        //排序
        cards.sort(new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                //按照点数排序
                return o1.getNum() - o2.getNum();
            }
        });
    }
}
