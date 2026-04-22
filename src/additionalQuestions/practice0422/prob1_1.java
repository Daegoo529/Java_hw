package additionalQuestions.practice0422;

import java.util.Scanner;
//BufferedReader(new InputStreamReader(System.in)) 사용하셔도 됩니다.

public class prob1_1 {
    // 사용자에게 보여주는 메시지
    private static final String INPUT_MESSAGE = "숫자로 입력해 주세요";

    // 예외 발생기 출력할 메시지
    private static final String EMPTY_INPUT_ERROR_MESSAGE = "\"예외가 발생괴었습니다. 문자열을 입력하지 않고 Enter키를 누르셨습니다.";
    private static final String INVALID_NUMBER_ERROR_MESSAGE = "숫자로 변환 할 수 없는 문자열 입니다.";
    //필요할 경우 다음의 메서드 선언부분(메서드 시그너처)을 수정하시기 바랍니다.
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println(INPUT_MESSAGE);
        String str= scan.nextLine();
        int result= 0;
        //여기를 작성하십시오.
        try {
            result = convert(str);
            System.out.println("변환된 숫자는 "+result+"입니다.");
        } catch (IllegalArgumentException e){
            System.out.println(EMPTY_INPUT_ERROR_MESSAGE);

        } catch ( Exception e1){
            System.out.println(INVALID_NUMBER_ERROR_MESSAGE);
        } finally {
            scan.close();
        }
    }

    //필요할 경우 다음의 메서드 선언부분(메서드 시그너처)을 수정하시기 바랍니다.
    private static int convert(String str) throws IllegalArgumentException {
        //여기를 작성하십시오.
        int convertResult = 0;
        if(str == null || str.isEmpty() ){
            throw new IllegalArgumentException();
        }
        convertResult = Integer.parseInt(str);

        return convertResult;
    }
}
