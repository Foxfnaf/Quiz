package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List questionList = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Test wiedzy o Five Nights at Freddy's");
        System.out.println("Wpisuj tylko literę odpowiadająca odpowiedzi na przykład a");
        addQuestionToList(questionList);
        printQuestion(questionList, scanner);

    }

    private static void printQuestion(List questionlist, Scanner scanner){
        for(int i = 0; i < questionlist.size(); i++){
            System.out.println(questionlist.get(i));
            printAnswer(i, scanner);
            System.out.println();
        }
    }

    private static void printAnswer(int i, Scanner scanner){
        switch (i){
            case 0 -> {
                System.out.println("a 1983    b 1874");
                System.out.println("c 2023    d 1892");
                System.out.println("Wpisz odpowiedź");
            }
            case 1 -> {
                System.out.println("a Zatrzasnął się w stroju Spring Bonnie'go    b Potrącił go samochód");
                System.out.println("c Utopił się                                  d Popełnił samobójstwo");
            }
            case 2 -> System.out.println("a Csiii    b Nic nie mówi");
            case 3 -> {
                System.out.println("a Uwięzienie i spalenie reszty animatroników    b Nie ma czegoś takiego");
                System.out.println("c Procedury bezpieczęstwa                       d Zwolnnienie pracownika");
            }
            case 4 -> {
                System.out.println("a Vincent          b Wiliam Afton");
                System.out.println("c Michael Afton    d William Afton");
            }
            case 5 -> {
                System.out.println("a FNAF    b fnaf");
                System.out.println("c Fnaf    d FNaF");
            }
            case 6 -> {
                System.out.println("a 5:00    b 3:00");
                System.out.println("c 7:00    d 6:00");
            }
            case 7 -> {
                System.out.println("a Fox    b foxy");
                System.out.println("c Foxy   d the fox");
            }
            case 8 -> {
                System.out.println("a 10:00   b 11:00");
                System.out.println("c 12:00    d 1:00");
            }
            case 9 -> System.out.println("a Przed bałaganieniem    b Przed zgaszeniem świateł");

        }
    }
    private static void addQuestionToList(List questionList) {
        questionList.add("W którym raku powstała 2. pizzeria Freddy'ego?");
        questionList.add("Jak zginął Purple Guy?");
        questionList.add("Co Lefty mówi do gracza po jumpscare?");
        questionList.add("Co to \"paragraf 4\"?");
        questionList.add("Jak nazywał się morderca?");
        questionList.add("Poprawny skrót od Five Nights at Freddy's brzmi...");
        questionList.add("O której kończymy nocną zmianę?");
        questionList.add("Jak nazywa się animatroniczny lis?");
        questionList.add("O której zaczynamy nocną zmianę?");
        questionList.add("Przed czym ostrzega nas Sun?");
    }

}