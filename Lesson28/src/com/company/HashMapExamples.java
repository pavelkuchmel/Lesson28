package com.company;

import java.util.*;

public class HashMapExamples {
    public static void main(String[] args) {
//        Map<Integer, String> studList = new HashMap<>();
//        studList.put(1, "Екатерина");
//        studList.put(2, "Денис");
//        studList.put(3, "Константин");
//        studList.put(4, "Павел");
//        studList.put(5, "Владимир");
//
//        for (Integer key : studList.keySet()){
//            System.out.println(key + " " + studList.get(key));
//        }

        /*Map<String, Integer> catsCabinet = new HashMap<>();
        String[] catsNames = {"Вася", "Барсик", "Рыжик", "Толик", "Аркаша", "Иннокентий Федорович", "Чарли", "Борис"};
        Random rdm = new Random();

        for (int i = 0; i < catsNames.length; i++){
            catsCabinet.put(catsNames[rdm.nextInt(catsNames.length)], rdm.nextInt(9)+1);
        }

        for (String key : catsCabinet.keySet()){
            System.out.println(key + " " + catsCabinet.get(key));
        }
        System.out.println();
        for (Map.Entry<String, Integer> pair : catsCabinet.entrySet()) {
            if (pair.getValue().equals(5)) {
                System.out.println(pair.getKey() + " " + pair.getValue());
            }
        }*/

        /*String text = "Кто пришёл ко мне с утра?" +
                "Мамочка." +
                "Кто сказал: Вставать пора?" +
                "Мамочка." +
                "Кашу кто успел сварить?" +
                "Мамочка." +
                "Чаю – в пиалу налить?" +
                "Мамочка." +
                "Кто косички мне заплёл?" +
                "Мамочка." +
                "Целый дом один подмёл?" +
                "Мамочка." +
                "Кто цветов в саду нарвал?" +
                "Мамочка." +
                "Кто меня поцеловал?" +
                "Мамочка." +
                "Кто ребячий любит смех?" +
                "Мамочка." +
                "Кто на свете лучше всех?" +
                "Мамочка.";
        String str1 = splitTextInToWords(text);
        String[] str2 = str1.split("\n");
        System.out.println(Arrays.toString(str2));*/

        Map<Person, List<? extends Pet>> hm1 = new HashMap<>();   //List<? extends Pet> - означает: любой наследник класса List. Место еxtends может быть super
        hm1.put(new Person("Ваня"), Arrays.asList(new Cat("Василий"), new Dog("Бобик")));  //Arrays.asList - принимает массив и возвращает его ввиде коллекции







    }
    public static String splitTextInToWords(String text) {
        return text.replaceAll("-", " ")
                .replaceAll("\\p{Punct}|[0-9]", " ")
                .replaceAll(" ", "\n");
    }
}
