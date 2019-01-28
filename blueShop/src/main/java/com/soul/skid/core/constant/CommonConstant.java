package com.soul.skid.core.constant;

/**
 * @Class : CommonConstant
 * @Description : 공통상수 정의
 * 
 */
public class CommonConstant {

	/** Zero & One */
	private static final String STR_ZERO = "0";
	private static final String STR_ONE = "1";
	private static final int INT_ZERO = 0;
	private static final int INT_ONE = 1;
	private static final long LONG_ZERO = 0;
	private static final long LONG_ONE = 1;
	
	/** 9(8자리) 문자 */
	private static final String STR_NINE_THOUSAND = "99999999";
	private static final String STR_NINE_HUNDRED_NINETY_NINE = "999";
	private static final String STR_NINETY_NINE = "99";
	private static final String STR_NINE = "9";
	
	/** 9(8자리) 숫자 */
	private static final int INT_NINE_THOUSAND = 99999999;
	private static final int INT_NINE = 9;
	
	private static final String FIRST_DT = "0001-01-01";
	private static final String END_DT = "9999-12-31";
	private static final String ENDDT = "99991231";

	/** Yes & No */
	private static final String YES = "Y";
	private static final String NO = "N";
	private static final String FAIL = "F";
	private static final String ERROR = "E";
	
	/** result code */
	private static final String RESULT_SUCCESS = "success";
	private static final String RESULT_OK = "ok";
	private static final String RESULT_FAIL = "fail";
	private static final String RESULT_ERROR = "error";
	
	/** error reason */
	private static final String RESULT_EXCEPTION = "Exception";
	private static final String RESULT_DUPLICATE = "Duplicate";
	private static final String RESULT_USED = "Used";
	private static final String RESULT_NOT_FOUND = "NotFound";
	
	/** 
	 * Thumbnail width, height size
	 */
	private static final int THUMBNAIL_WIDTH = 100;
	private static final int THUMBNAIL_HEIGHT = 100;
	
	/** 이미지 미디어 타입 */
	private static final String IMG_EXTS = "gif|png|jpg|jpeg|";
	
	/** 처리코드(CRUD) */
	private static final String DELETE = "D";
	private static final String INSERT = "C";
	private static final String UPDATE = "U";
	
	/** 조회 조건 */
	private static final String RS_NXT_PAGE_FL = "nxtPageFl";
	private static final String RS_NXT1_KEY_VAL = "nxt1KeyVal";
	private static final String RS_NXT2_KEY_VAL = "nxt2KeyVal";
	private static final String RS_NXT3_KEY_VAL = "nxt3KeyVal";
	
	/** First Called Page Number */
	private static final int FIRST_PAGE_NUM = 1;
	/** page per list item count */
	private static final int PAGE_PER_COUNT= 10;
	
	/** 작업자ID 초기값 */
	private static final String DFLT_WK_ID = "system";
	
	/** 결과값의 목록명 */
	private static final String RESULT_LIST_NM = "list";

	public static String getStrZero() {
		return STR_ZERO;
	}

	public static String getStrOne() {
		return STR_ONE;
	}

	public static int getIntZero() {
		return INT_ZERO;
	}

	public static int getIntOne() {
		return INT_ONE;
	}

	public static long getLongZero() {
		return LONG_ZERO;
	}

	public static long getLongOne() {
		return LONG_ONE;
	}

	public static String getStrNineThousand() {
		return STR_NINE_THOUSAND;
	}

	public static String getStrNineHundredNinetyNine() {
		return STR_NINE_HUNDRED_NINETY_NINE;
	}

	public static String getStrNinetyNine() {
		return STR_NINETY_NINE;
	}

	public static String getStrNine() {
		return STR_NINE;
	}

	public static int getIntNineThousand() {
		return INT_NINE_THOUSAND;
	}

	public static int getIntNine() {
		return INT_NINE;
	}

	public static String getFirstDt() {
		return FIRST_DT;
	}

	public static String getEndDt() {
		return END_DT;
	}

	public static String getEnddt() {
		return ENDDT;
	}

	public static String getYes() {
		return YES;
	}

	public static String getNo() {
		return NO;
	}

	public static String getFail() {
		return FAIL;
	}

	public static String getError() {
		return ERROR;
	}


	public static String getResultSuccess() {
		return RESULT_SUCCESS;
	}

	public static String getResultOk() {
		return RESULT_OK;
	}

	public static String getResultFail() {
		return RESULT_FAIL;
	}

	public static String getResultError() {
		return RESULT_ERROR;
	}

	public static String getResultException() {
		return RESULT_EXCEPTION;
	}

	public static String getResultDuplicate() {
		return RESULT_DUPLICATE;
	}

	public static String getResultUsed() {
		return RESULT_USED;
	}

	public static String getResultNotFound() {
		return RESULT_NOT_FOUND;
	}

	public static int getThumbnailWidth() {
		return THUMBNAIL_WIDTH;
	}

	public static int getThumbnailHeight() {
		return THUMBNAIL_HEIGHT;
	}

	public static String getImgExts() {
		return IMG_EXTS;
	}

	public static String getDelete() {
		return DELETE;
	}

	public static String getInsert() {
		return INSERT;
	}

	public static String getUpdate() {
		return UPDATE;
	}

	public static String getRsNxtPageFl() {
		return RS_NXT_PAGE_FL;
	}

	public static String getRsNxt1KeyVal() {
		return RS_NXT1_KEY_VAL;
	}

	public static String getRsNxt2KeyVal() {
		return RS_NXT2_KEY_VAL;
	}
	public static int getFirstPageNum() {
		return FIRST_PAGE_NUM;
	}

	public static int getPagePerCount() {
		return PAGE_PER_COUNT;
	}

	public static String getDfltWkId() {
		return DFLT_WK_ID;
	}

	public static String getRsNxt3KeyVal() {
		return RS_NXT3_KEY_VAL;
	}

	/**
	 * 결과값의 목록 지정명
	 * @return "list"
	 */
	public static String getResultListNm() {
		return RESULT_LIST_NM;
	}
}
