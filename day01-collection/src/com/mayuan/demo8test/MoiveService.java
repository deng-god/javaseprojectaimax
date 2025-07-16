package com.mayuan.demo8test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoiveService {
    private static List<Movie> moives = new ArrayList<Movie>();
    private static Scanner scanner = new Scanner(System.in);

    public void start() {
        //操作界面
        while (true) {
            System.out.println("=======电影操作系统======");
            System.out.println("1.添加电影");
            System.out.println("2.删除电影");
            System.out.println("3.修改电影");
            System.out.println("4.查询电影");
            System.out.println("5.封杀某个明星");
            System.out.println("6.查询全部电影");
            System.out.println("7.退出");
            System.out.println("请输入您的选择：");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addMovie();
                    break;
                case 2:
//                    deleteMovie();
                    break;
                case 3:
//                    updateMovie();
                    break;
                case 4:
                    queryMovie();
                    break;
                case 5:
                    killStar();
                    break;

                case 6:
                    queryAllMovie();
                    break;
                case 7:
                    System.out.println("退出系统");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
                    break;
            }
        }
    }

    private void queryAllMovie() {
        System.out.println("======查询全部电影======");
        for (Movie m : moives) {
            System.out.println(m.getName() + " " + m.getScore() + " " + m.getActor() + " " + m.getPrice());
        }
        System.out.println("查询成功");
    }

    private void killStar() {
        System.out.println("======封杀明星======");
        System.out.println("请输入明星名称：");
        String name = scanner.next();

        for (int i = 0; i < moives.size(); i++) {
            Movie movie = moives.get(i);
            if (movie.getActor().contains(name)) {
                moives.remove(movie);
                System.out.println("封杀成功");
                i--;
            }
            queryAllMovie();
        }
    }

    private void queryMovie() {
        System.out.println("======查询电影======");
        System.out.println("请输入电影名称：");
        String name = scanner.next();
        //根据电影名称查询电影返回对象，展示这个对象
        Movie movie = queryMovieByName(name);
        if (movie != null) {
            System.out.println(movie.getName() + " " + movie.getScore() + " " + movie.getActor() + " " + movie.getPrice());
            System.out.println("查询成功");
        } else {
            System.out.println("没有找到该电影");
        }

    }

    //根据电影名称查询电影返回对象
    private Movie queryMovieByName(String name) {
        for (Movie m : moives) {
            if (m.getName().equals(name)) {
                return m;
            }
        }
        return null;
    }

    private void addMovie() {
        System.out.println("======上架电影======");
        //创建电影对象，添加电影信息
        Movie movie = new Movie();
        System.out.println("请输入电影名称：");
        movie.setName(scanner.next());
        System.out.println("请输入电影评分：");
        movie.setScore(scanner.nextDouble());
        System.out.println("请输入主演：");
        movie.setActor(scanner.next());
        System.out.println("请输入价格：");
        movie.setPrice(scanner.nextDouble());
        moives.add(movie);
        System.out.println("添加成功");


    }
}
