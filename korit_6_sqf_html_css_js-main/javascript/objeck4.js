// 비구조 할당, 구조분해
function main() {
    const user = {
        username : "admin",
        password : "1234",
        name : "정상훈",
        email : "qwe@gmail.com"
    }
    const names = [ "박현주", "이성희", "권오광", "권혁진" ];

    const { username, password, email } = user;
    console.log(username);
    console.log(password);
    console.log(email);

    const [ a, b ] = names;
    console.log(a);
    console.log(b);

    /* name을 포함한 나머지 객체를 가져온다 */
    const { name, ...newUser } = user; // 변수로 사용되고 있는건 재정의 못한다
    console.log(newUser);

    console.log(names.slice(1, 4)); // 가져오고 싶은 위치를 지정하여 가져온다 (names.slice(1, 4)) -> 1번 이후부터 4번 이전까지 출력되는건 2번 
}
main();