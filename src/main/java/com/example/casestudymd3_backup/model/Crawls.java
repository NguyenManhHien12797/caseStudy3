//package com.example.casestudymd3_backup.model;
//import com.example.casestudymd3_backup.model.productShoes.Shoes;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Crawls {
//    public List<com.example.caseStudyMd3.model.productShoes.Shoes> getNike() {
//        List<com.example.caseStudyMd3.model.productShoes.Shoes> shoes1 = new ArrayList<>();
//        try {
//            final String url = "https://kingshoes.vn/nike";
//            Document doc = Jsoup.connect(url).get();
//            ArrayList<Element> elements = doc.getElementsByClass("ps-shoe__name");
//            ArrayList<Element> elements1 = doc.getElementsByClass("ps-shoe__price");
//            ArrayList<Element> elements3 = doc.getElementsByClass("lazy");
//            for (int i = 1; i <= 10; i++) {
//                String name = elements.get(i).getElementsByTag("a").text();
//                String price = elements1.get(i).getElementsByTag("span").text();
//                String str = String.valueOf(elements3.get(i).getElementsByTag("img").html("data-src"));
//                String [] str1 = str.split("<img class=\"lazy\" src=\"template/Default/img/loader.svg\" data-src=\"");
//                String [] str2 = str1[1].split("\" alt");
//                String image=str2[0];
//                System.out.println(image);
//                Shoes shoes=new Shoes(name,price,image);
//                shoes1.add(shoes);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return shoes1;
//    }
//    public List<Shoes> getAdidas() {
//        List<Shoes> shoes1 = new ArrayList<>();
//        try {
//            final String url = "https://kingshoes.vn/adidas";
//            Document doc = Jsoup.connect(url).get();
//            ArrayList<Element> elements = doc.getElementsByClass("ps-shoe__name");
//            ArrayList<Element> elements1 = doc.getElementsByClass("ps-shoe__price");
//            ArrayList<Element> elements3 = doc.getElementsByClass("lazy");
//            for (int i = 0; i <= 10; i++) {
//                String name = elements.get(i).getElementsByTag("a").text();
//                String price = elements1.get(i).getElementsByTag("span").text();
//                String str = String.valueOf(elements3.get(i).getElementsByTag("img").html("data-src"));
//                String [] str1 = str.split("<img class=\"lazy\" src=\"template/Default/img/loader.svg\" data-src=\"");
//                String [] str2 = str1[1].split("\" alt");
//                String image=str2[0];
//                System.out.println(image);
//                Shoes shoes=new Shoes(name,price,image);
//                shoes1.add(shoes);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return shoes1;
//    }
//
//    public List<Shoes> getJordan() {
//        List<Shoes> shoes1 = new ArrayList<>();
//        try {
//            final String url = "https://kingshoes.vn/jordan";
//            Document doc = Jsoup.connect(url).get();
//            ArrayList<Element> elements = doc.getElementsByClass("ps-shoe__name");
//            ArrayList<Element> elements1 = doc.getElementsByClass("ps-shoe__price");
//            ArrayList<Element> elements3 = doc.getElementsByClass("lazy");
//            for (int i = 0; i <= 10; i++) {
//                String name = elements.get(i).getElementsByTag("a").text();
//                String price = elements1.get(i).getElementsByTag("span").text();
//                String str = String.valueOf(elements3.get(i).getElementsByTag("img").html("data-src"));
//                String [] str1 = str.split("<img class=\"lazy\" src=\"template/Default/img/loader.svg\" data-src=\"");
//                String [] str2 = str1[1].split("\" alt");
//                String image=str2[0];
//                System.out.println(image);
//                Shoes shoes=new Shoes(name,price,image);
//                shoes1.add(shoes);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return shoes1;
//    }
//    public List<Shoes> getYeezy() {
//        List<Shoes> shoes1 = new ArrayList<>();
//        try {
//            final String url = "https://kingshoes.vn/yeezy";
//            Document doc = Jsoup.connect(url).get();
//            ArrayList<Element> elements = doc.getElementsByClass("ps-shoe__name");
//            ArrayList<Element> elements1 = doc.getElementsByClass("ps-shoe__price");
//            ArrayList<Element> elements3 = doc.getElementsByClass("lazy");
//            for (int i = 0; i <= 10; i++) {
//                String name = elements.get(i).getElementsByTag("a").text();
//                String price = elements1.get(i).getElementsByTag("span").text();
//                String str = String.valueOf(elements3.get(i).getElementsByTag("img").html("data-src"));
//                String [] str1 = str.split("<img class=\"lazy\" src=\"template/Default/img/loader.svg\" data-src=\"");
//                String [] str2 = str1[1].split("\" alt");
//                String image=str2[0];
//                System.out.println(image);
//                Shoes shoes=new Shoes(name,price,image);
//                shoes1.add(shoes);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return shoes1;
//    }
//}
