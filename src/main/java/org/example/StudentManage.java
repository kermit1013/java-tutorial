package org.example;

public class StudentManage {
    public static void main(String[] args) {
        // 學生姓名數組
        String[] names = {"小明", "小華", "小芳", "小強", "小李"};
        
        // 各科成績數組
        int[] mathScores = {85, 76, 92, 63, 70};
        int[] englishScores = {92, 83, 78, 86, 72};
        int[] scienceScores = {76, 90, 88, 67, 95};

        // 顯示所有學生的成績
        System.out.println("所有學生成績單：");
        displayAllGrades(names, mathScores, englishScores, scienceScores);

        // 計算並顯示平均分
        System.out.println("\n各科平均分：");
        double mathAvg = calculateAverage(mathScores);
        double englishAvg = calculateAverage(englishScores);
        double scienceAvg = calculateAverage(scienceScores);

        System.out.println("數學平均分: " + formatScore(mathAvg));
        System.out.println("英語平均分: " + formatScore(englishAvg));
        System.out.println("科學平均分: " + formatScore(scienceAvg));

        // 找出各科最高分的學生
        System.out.println("\n各科最高分：");
        findAndDisplayTopStudent(names, mathScores, "數學");
        findAndDisplayTopStudent(names, englishScores, "英語");
        findAndDisplayTopStudent(names, scienceScores, "科學");

        // 計算並顯示總分最高的學生
        System.out.println("\n總分排名：");

        displayTotalScoreRanking(names, mathScores, englishScores, scienceScores);
    }

    // 顯示所有學生的成績
    public static void displayAllGrades(String[] names, int[] mathScores,
                                        int[] englishScores, int[] scienceScores) {
        System.out.println("姓名\t數學\t英語\t科學\t總分");
        System.out.println("----------------------------------------");

        for (int i = 0; i < names.length; i++) {
            int total = calculateTotalScore(mathScores[i], englishScores[i], scienceScores[i]);
            System.out.println(names[i] + "\t" +
                    mathScores[i] + "\t" +
                    englishScores[i] + "\t" +
                    scienceScores[i] + "\t" +
                    total);
        }
    }

    // 計算單個學生的總分
    public static int calculateTotalScore(int math, int english, int science) {
        return math + english + science;
    }

    // 計算一門課程的平均分
    public static double calculateAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    // 格式化分數顯示（保留兩位小數）
    public static String formatScore(double score) {
        return String.format("%.2f", score);
    }

    // 找出某門課程最高分的學生
    public static void findAndDisplayTopStudent(String[] names, int[] scores, String subject) {
        int maxScore = findMaxScore(scores);
        int maxIndex = findIndexOfMaxScore(scores);

        System.out.println(subject + "最高分: " + maxScore + " (學生: " + names[maxIndex] + ")");
    }

    // 找出最高分
    public static int findMaxScore(int[] scores) {
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }

    // 找出最高分的索引
    public static int findIndexOfMaxScore(int[] scores) {
        int maxIndex = 0;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > scores[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // 顯示總分排名
    public static void displayTotalScoreRanking(String[] names, int[] mathScores,
                                                int[] englishScores, int[] scienceScores) {
        // 計算所有學生的總分
        int[] totalScores = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            totalScores[i] = calculateTotalScore(mathScores[i], englishScores[i], scienceScores[i]);
        }

        // 創建索引數組用於排序
        int[] indices = new int[names.length];
        for (int i = 0; i < indices.length; i++) {
            indices[i] = i;
        }

        // 根據總分對索引進行排序（簡單的選擇排序）
        sortByTotalScore(indices, totalScores);

        // 顯示排名
        System.out.println("排名\t姓名\t總分\t平均分");
        System.out.println("----------------------------------------");
        for (int i = 0; i < indices.length; i++) {
            int idx = indices[i];
            double average = (double) totalScores[idx] / 3;
            System.out.println((i + 1) + "\t" +
                    names[idx] + "\t" +
                    totalScores[idx] + "\t" +
                    formatScore(average));
        }
    }

    // 根據總分對索引進行排序（從高到低）
    public static void sortByTotalScore(int[] indices, int[] totalScores) {
        for (int i = 0; i < indices.length - 1; i++) {
            for (int j = i + 1; j < indices.length; j++) {
                if (totalScores[indices[j]] > totalScores[indices[i]]) {
                    // 交換索引
                    int temp = indices[i];
                    indices[i] = indices[j];
                    indices[j] = temp;
                }
            }
        }
    }
}