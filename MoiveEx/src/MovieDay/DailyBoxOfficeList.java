package MovieDay;

public class DailyBoxOfficeList {
	

	public String rnum;
	public String rank;
	public String rankInten;
	public String rankOldAndNew;
	public String movieCd;
	public String movieNm;
	public String openDt;
	public String salesAmt;
	public String salesShare;
	public String salesInten;
	public String salesChange;
	public String salesAcc;
	public String audiCnt;	
	public String audiInten;
	public String audiChange;
	public String audiAcc;
	public String scrnCnt;
	public String showCnt;
	
	public String getRnum() {
		return rnum;
	}
	public void setRnum(String rnum) {
		this.rnum = rnum;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getRankInten() {
		return rankInten;
	}
	public void setRankInten(String rankInten) {
		this.rankInten = rankInten;
	}
	public String getRankOldAndNew() {
		return rankOldAndNew;
	}
	public void setRankOldAndNew(String rankOldAndNew) {
		this.rankOldAndNew = rankOldAndNew;
	}
	public String getMovieCd() {
		return movieCd;
	}
	public void setMovieCd(String movieCd) {
		this.movieCd = movieCd;
	}
	public String getMovieNm() {
		return movieNm;
	}
	public void setMovieNm(String movieNm) {
		this.movieNm = movieNm;
	}
	public String getOpenDt() {
		return openDt;
	}
	public void setOpenDt(String openDt) {
		this.openDt = openDt;
	}
	public String getSalesAmt() {
		return salesAmt;
	}
	public void setSalesAmt(String salesAmt) {
		this.salesAmt = salesAmt;
	}
	public String getSalesShare() {
		return salesShare;
	}
	public void setSalesShare(String salesShare) {
		this.salesShare = salesShare;
	}
	public String getSalesInten() {
		return salesInten;
	}
	public void setSalesInten(String salesInten) {
		this.salesInten = salesInten;
	}
	public String getSalesChange() {
		return salesChange;
	}
	public void setSalesChange(String salesChange) {
		this.salesChange = salesChange;
	}
	public String getSalesAcc() {
		return salesAcc;
	}
	public void setSalesAcc(String salesAcc) {
		this.salesAcc = salesAcc;
	}
	public String getAudiCnt() {
		return audiCnt;
	}
	public void setAudiCnt(String audiCnt) {
		this.audiCnt = audiCnt;
	}
	public String getAudiInten() {
		return audiInten;
	}
	public void setAudiInten(String audiInten) {
		this.audiInten = audiInten;
	}
	public String getAudiChange() {
		return audiChange;
	}
	public void setAudiChange(String audiChange) {
		this.audiChange = audiChange;
	}
	public String getAudiAcc() {
		return audiAcc;
	}
	public void setAudiAcc(String audiAcc) {
		this.audiAcc = audiAcc;
	}
	public String getScrnCnt() {
		return scrnCnt;
	}
	public void setScrnCnt(String scrnCnt) {
		this.scrnCnt = scrnCnt;
	}
	public String getShowCnt() {
		return showCnt;
	}
	public void setShowCnt(String showCnt) {
		this.showCnt = showCnt;
	}
	
	@Override
	public String toString() {
		return "DailyBoxOfficeList [rnum=" + rnum + ", rank=" + rank + ", rankInten=" + rankInten + ", rankOldAndNew="
				+ rankOldAndNew + ", movieCd=" + movieCd + ", movieNm=" + movieNm + ", openDt=" + openDt + ", salesAmt="
				+ salesAmt + ", salesShare=" + salesShare + ", salesInten=" + salesInten + ", salesChange="
				+ salesChange + ", salesAcc=" + salesAcc + ", audiCnt=" + audiCnt + ", audiInten=" + audiInten
				+ ", audiChange=" + audiChange + ", audiAcc=" + audiAcc + ", scrnCnt=" + scrnCnt + ", showCnt="
				+ showCnt + "]";
	}
	
	public String rank() {
		return this.rank + " | "+this.movieNm;
	}


}
