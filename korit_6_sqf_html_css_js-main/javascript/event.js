/* 
  이벤트 -> 사용자가 동작을 행하면 실행된다

  마우스 이벤트
  onclick 클릭
  키보드 이벤트
  onkeydown 키보드를 누르고 있으면 입력
  onkeyup 키보드를 눌렸다 때면 입력
  onkeypress 
  onfocus
  onblur

  문서 로딩 이벤트
  scroll

*/
function handleButtonClick(e) { buttonclick
    console.log({event : e});
    console.log(e.target.innerHTML);
    e.target.innerHTML = "취소";
}
function handleInputChange(e) {
    if(e.ctrlkey && (e.keyCode === 13 || e.key === "Enter")) {
        alert(e.target.value);
    }
} /* 키입력만으로 출력시키고 싶을때는 console.log(e.target.value); 사용 */
let isFocus = false;
function handleInputFocus(e) {
    if(!isFocus) {
        isFocus = true;
        alert("입력하세요!");
    }
} /* alert 만 쓰면 무한 이벤트로 변경됨 let isFocus = false; 를 잡아줘야 탈출 */
function handleInputFocus(e) {
    if(!!e.target.value) {
        e.target.value = "";
    }
}
function handleInputBlur(e) {
    if(e.target.value) {
        alert("값을 입력해주세요");
    }
}
