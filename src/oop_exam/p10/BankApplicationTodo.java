package oop_exam.p10;


import java.util.Scanner;

public class BankApplicationTodo {
    static AccountTodo[] accountArray = new AccountTodo[100];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            System.out.println("------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택> ");
            String selectNo = scanner.nextLine();

            switch (selectNo) {
                case "1":
                    createAccount();
                    break;
                case "2":
                    accountList();
                    break;
                case "3":
                    deposit();
                    break;
                case "4":
                    withdraw();
                    break;
                case "5":
                    run = false;
                    System.out.println("프로그램 종료");
                    break;
            }
        }
    }

    static void createAccount() {
        int index = 0;

        // TODO 1: "계좌생성" 안내를 출력하세요.
        System.out.println("계좌를 생성합니다.");

        // TODO 2: 계좌번호, 계좌주, 초기입금액을 nextLine()으로 입력받으세요.
        System.out.println("새로 만들 계좌 번호를 입력해 주세요 > ");
        String ano = scanner.nextLine();
        System.out.println("계좌 소유자의 이름을 입력해 주세요 > ");
        String owner = scanner.nextLine();
        System.out.println("초기 입금액을 입력해 주세요 > ");
        int balance = Integer.parseInt(scanner.nextLine());
        System.out.println("현재 잔액 : "+ balance);


        // TODO 3: 새 AccountTodo 객체를 생성하세요.
        AccountTodo ac = new AccountTodo(ano,owner,balance);

        // TODO 4: accountArray에서 null인 첫 위치를 찾아 저장하세요.
        // TODO 5: "결과: 계좌가 생성되었습니다."를 출력하세요.
        for(int i=0; i<accountArray.length; i++){
            if(accountArray[i] == null ){
                accountArray[i] = ac;
                System.out.println("결과 : 계좌가 생성되었습니다.");
                break;
            }
        }



    }

    static void accountList() {
        // TODO 6: 저장된 모든 계좌를 출력하세요.
        // 출력 형식:
        // 111-111    홍길동    10000
        System.out.println("계좌목록");
        for(AccountTodo at : accountArray){
            if( at != null){
                System.out.println(at.ano+ "\t"+at.owner+"\t"+at.balance);
            }
        }
    }

    static void deposit() {
        // TODO 7: 계좌번호와 예금액을 입력받으세요.
        System.out.println("가지고 계신 계좌번호를 입력해 주세요 > ");
        String ano = scanner.nextLine();
        System.out.println("입금하실 금액을 입력해 주세요 > ");
        int balance = Integer.parseInt(scanner.nextLine());

        // TODO 8: findAccount(계좌번호)로 계좌를 찾으세요.
        // TODO 9: 계좌가 있으면 balance에 예금액을 더하고 성공 메시지를 출력하세요.
        try {
            if (findAccount(ano) != null) {
                if (balance > 0) {
                    findAccount(ano).balance += balance;
                    System.out.println("계좌에 " + balance + "원 입금을 성공했습니다.\n현재 잔액 : " + findAccount(ano).balance);
                } else {
                    System.out.println("입금액은 음수가 될 수 없습니다.");
                }
            }
        }catch (Exception e){
            System.out.println("해당하는 계좌가 없습니다.");
        }
    }

    static void withdraw() {
        // TODO 10: 계좌번호와 출금액을 입력받으세요.
        System.out.println("가지고 계신 계좌번호를 입력해 주세요 > ");
        String ano = scanner.nextLine();
        System.out.println("출금하실 금액을 입력해 주세요 > ");
        int balance = Integer.parseInt(scanner.nextLine());

        // TODO 11: findAccount(계좌번호)로 계좌를 찾으세요.
        // TODO 12: 계좌가 있으면 balance에서 출금액을 빼고 성공 메시지를 출력하세요.
        try {
            if (findAccount(ano) != null) {
                if(balance > 0) {
                    findAccount(ano).balance -= balance;
                    System.out.println("계좌에 " + balance + "원 출금을 성공했습니다.\n현재 잔액 : " + findAccount(ano).balance);
                }else{
                    System.out.println("출금액은 음수가 될 수 없습니다.");
                }
            }
        }catch (Exception e){
            System.out.println("해당하는 계좌가 없습니다.");
        }
    }

    static AccountTodo findAccount(String ano) {
        // TODO 13: 배열을 순회하면서 ano가 같은 계좌를 찾으세요.
        // TODO 14: 찾으면 해당 AccountTodo를 반환하세요.
        // TODO 15: 끝까지 없으면 null을 반환하세요.
        int find = -1;
        for(int i = 0; i<accountArray.length; i++){
            if(ano.equals(accountArray[i].ano)){
                find = i;
                return accountArray[find];
            }
        }
        System.out.println("해당되는 계좌번호가 없습니다.");
        return null;
    }
}
