package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        final int EXCEPTION = -1;
        int answer = Integer.MAX_VALUE;

        if(!isOk(pobi) || !isOk(crong)) return EXCEPTION;

        return answer;
    }

    public static boolean isOk(List<Integer> bookPages){
        int leftPage = bookPages.get(0);
        int rightPage = bookPages.get(1);

        if(leftPage<1 || leftPage>400 || rightPage<1 || rightPage>400) return false;
        if(rightPage - leftPage != 1) return false;

        return true;
    }

    public static int calculatePage(int bookPage){
        int plusResult = 0;
        int multiResult = 1;

        while(bookPage > 0){
            plusResult += bookPage % 10;
            multiResult *= bookPage % 10;

            bookPage /= 10;
        }

        return plusResult > multiResult ? plusResult : multiResult;
    }

}