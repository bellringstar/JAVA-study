package com.company.part2;

import com.company.external.British;
import com.company.external.Cat;
import com.company.external.Persian;

public class Main {
    public static void main(String[] args) {
        British british = new British();
        Persian persian = new Persian();
        british.hunt();
        persian.hunt();

    }
}
