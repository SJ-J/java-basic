package class1.ex;

public class MovieReviewMain {
    // 2. main() 메서드를 포함한 MovieReviewMain 클래스 생성
    public static void main(String[] args) {
    // 3. 영화 리뷰 정보 선언
        MovieReview mr1 = new MovieReview();
        mr1.title = "어두운 바다의 등불이 되어";
        mr1.contents = "치실을 잘 하자…";

        MovieReview mr2 = new MovieReview();
        mr2.title = "곤 투모로우";
        mr2.contents = "실패한 정변은 오타쿠를 끌어당긴다";

        MovieReview[] mrs = {mr1, mr2};

    // 4. 영화 리뷰 정보 출력
        for (MovieReview mr : mrs) {
            System.out.println("제목: " + mr.title + "\n리뷰: " + mr.contents);
            System.out.println("---------------------------------------");
        }
    }
}


// 출력 예시
/*
    영화 제목: "인셉션", 리뷰: "인생은 무한 루프"
    영화 제목: "어바웃 타임", 리뷰: "인생 시간 영화!"
*/