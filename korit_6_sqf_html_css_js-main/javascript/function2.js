const USERNAME = "admin";
const PASSWORD = "1234";

function login(username, password) {
  if(USERNAME === username && PASSWORD === password) {
    console.log("로그인 성공");
    return;
  }
  console.log("로그인 실패");
}
/*자바스크립트는 함수를 변수로 만들수 있다*/
const login2 = login;

login("admin", "1234");
login2("admin", "1234");

/* 함수명에도 대입이 되고 함수 통채로 넣을수 있다 */
const add2 = function add(x, y) {
  return x + y;
}
console.log(add2(10, 20));

/* 익명 함수 */
const sub2 = function (x, y) {
  return x - y;
}
console.log(sub2(20, 10));

// 화살표 함수(람다)
const div = function (x, y) {
  return !x || !y ? 0 : x / y;
} /* false(x) || fales(y) */
console.log(div(10, 2));

// 화살표 함수(명령이 한줄)
div = (x, y) => !x || !y ? 0 : x / y;
console.log(div(10, 2));

// 화살표 함수(매개변수가 하나면 괄호생략 가능)
const print = data => console.log(data);
print("출력!");

/* 함수안에 함수를 정의 할수 있다 
      함수안에 함수를 정의 할때는 화살표를 쓰자 */
function main() {
  const test = () => {
    console.log("테스트 함수 호출");
  }
  test();
} 
main();
