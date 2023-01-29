package chap_03;
// "961006-1234567" 인 경우 961006-1 까지 출력
// "030605-4567890" 인 경우 030605-4 까지 출력

public class _Quiz_03 {
    public static void main(String[] args) {
        String id = "961006-1234567"; // 주민등록번호 13자리
        System.out.println(id.substring(0,8)); // 0 위치부터 8 위치 직전까지
        id = "030605-4567890";
        System.out.println(id.substring(0,id.indexOf("-") + 2)); // 0 위치부터 하이폰 위치 +2 직전까지

    }
}
