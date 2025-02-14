package com.homework.Chapter7.hw02;

public class Hw02Test {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer("张云", 40);
        AssociateProfessor associateProfessor = new AssociateProfessor("高莲", 46);
        Professor professor = new Professor("翁凯", 38);

        lecturer.introduce();
        associateProfessor.introduce();
        professor.introduce();
    }
}
