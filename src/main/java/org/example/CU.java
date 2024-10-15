package org.example;

import java.util.ArrayList;

public class CU {

    private static String nameCu;
    private ArrayList<Mark> marks;
    private static int totalStudents;

    public CU() {
        marks = new ArrayList<>();
    }

    public void insertMarkCU(int numStudent, double mark) {
        Mark markedStudent = new Mark(numStudent, mark);
        marks.add(markedStudent);
    }

    public double searchStudent(int numStudent) {
        for (int i = 0; i < marks.size(); i++) {
            Mark markedStudent = marks.get(i);
            if (numStudent == markedStudent.getNumStudent()) {
                return markedStudent.getMark();
            }
        }
        return -1;
    }

    public double averageCU() {
        double totalMarks = 0;

        for (int i = 0; i < marks.size(); i++) {
            Mark markedStudent = marks.get(i);
            totalMarks += markedStudent.getMark();
        }

        return totalMarks / marks.size();
    }

    public boolean isApproved(int numStudent) {
        for (int i = 0; i < marks.size(); i++) {
            Mark markedStudent = marks.get(i);
            if (markedStudent.getNumStudent() == numStudent) {
                if (markedStudent.getNumStudent() >= 9.5);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public int marksSize() {
        return marks.size();
    }
}
