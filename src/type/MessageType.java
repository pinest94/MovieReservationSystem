package type;

public enum MessageType {
	ERROR("입력 오류입니다.."), INPUTBOOKERCODE("예매번호를 입력하세요 : "), INPUTRESERVATIONNUMBER("예매할 인원 수를 입력해주세요 : "), INPUTNAME("예매자 성함을 입력해주세요 : "),
	SELECTMOVIE("영화를 선택하세요 "), SELECTSEATTYPE("좌석구분 S(1), A(2), B(3) >> "), SELECTSEATNUMBER("좌석번호를 입력하세요 >> "),
	MOVIELIST("*** 현재 상영하는 영화목록입니다 ***"), ALREADYSEATS("이미 존재하는 좌석입니다"),
	SUCCEEDRESERVATION("예매가 성공적으로 완료되었습니다."), FAILRESERVATION("예매가 취소되었습니다."),
	SUCCEEDSHOW("조회를 완료했습니다."), FAILSHOW("조회를 실패했습니다."),
	SUCCEEDCANCEL("예매취소가 성공적으로 완료했습니다"), FAILCANCEL("예매취소가 실패했습니다."),
	EXIT("영화예매 프로그램이 종료되었습니다"), RUN("오늘 보고싶은 영화를 예매하세요!!");
	
	private String message;
	
	private MessageType(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}
