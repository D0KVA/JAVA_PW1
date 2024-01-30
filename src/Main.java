﻿import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    PrintWriter pw = new PrintWriter("Первый практос.txt");

    System.out.println("Приготовление жареной картошки");
    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println("Ингредиенты:");
    System.out.println("Картофель (в граммах) ");
    short kart = sc.nextShort();
    System.out.println("Репчатый лук (в головках) ");
    byte luk = sc.nextByte();
    System.out.println("Растительное масло (в мл) ");
    short rast_maslo = sc.nextByte();
    System.out.println("Сливочное масло (в граммах) ");
    short sliv_maslo = sc.nextByte();
    System.out.print("Соль");
    System.out.println(" по вкусу");
    System.out.print("Молотый чёрный перец");
    System.out.println(" по вкусу");
    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println("Приготовление:");
    System.out.println("---------------------");
    System.out.println("1. Картофель очистить, нарезать одинаковыми кусочками, не очень важно, будут это бруски или дольки. От способа и размера нарезки будет меняться время приготовления. ");
    System.out.println("Нарезанную картошку поместить в глубокую посуду и залить холодной водой, чтобы избавиться от лишнего крахмала. Оставить на 30–40 минут, затем хорошо обсушить на бумажных полотенцах.");
    System.out.println("---------------------");
    System.out.println("2. В толстостенной плоской сковороде на сильном огне разогреть растительное и сливочное масло.");
    System.out.println("Понизить огонь до средне-низкого и выложить картошку в один или максимум два слоя и жарить, не мешая, 5–7 минут.");
    System.out.println("---------------------");
    System.out.println("3. Затем немного перемешать, добавить измельченный лук и жарить в течение 15–20 минут, стараясь мешать картошку как можно реже и аккуратнее, чтобы не разрушить бруски.  ");
    System.out.println("В конце добавить соль и перец по вкусу. ");
    System.out.println("---------------------");
        pw.println("Приготовление жареной картошки");
        pw.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        pw.println("Ингредиенты:");
        pw.print("Картофель ");
        pw.print(kart);
        pw.println(" г.");
        pw.print("Репчатый лук ");
        pw.print(luk);
        pw.println(" головк(а/и)");
        pw.print("Растительное масло ");
        pw.print(rast_maslo);
        pw.println(" мл.");
        pw.print("Сливочное масло ");
        pw.print(sliv_maslo);
        pw.println(" г.");
        pw.print("Соль");
        pw.println(" по вкусу");
        pw.print("Молотый чёрный перец");
        pw.println(" по вкусу");
        pw.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        pw.println("Приготовление:");
        pw.println("---------------------");
        pw.println("1. Картофель очистить, нарезать одинаковыми кусочками, не очень важно, будут это бруски или дольки. От способа и размера нарезки будет меняться время приготовления. ");
        pw.println("Нарезанную картошку поместить в глубокую посуду и залить холодной водой, чтобы избавиться от лишнего крахмала. Оставить на 30–40 минут, затем хорошо обсушить на бумажных полотенцах.");
        pw.println("---------------------");
        pw.println("2. В толстостенной плоской сковороде на сильном огне разогреть растительное и сливочное масло.");
        pw.println("Понизить огонь до средне-низкого и выложить картошку в один или максимум два слоя и жарить, не мешая, 5–7 минут.");
        pw.println("---------------------");
        pw.println("3. Затем немного перемешать, добавить измельченный лук и жарить в течение 15–20 минут, стараясь мешать картошку как можно реже и аккуратнее, чтобы не разрушить бруски.  ");
        pw.println("В конце добавить соль и перец по вкусу. ");
        pw.println("---------------------");
    pw.close();
    }
}