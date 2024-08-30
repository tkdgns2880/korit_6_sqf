// user 를 통째로 가져오는 법
function printUser (user) {
    console.log('사용자이름: ${user.username}');
    console.log('비밀번호: ${user.password}');
    console.log('이름: ${user.name}');
    console.log('이메일: ${user.email}');
}
// user 를 풀어서 가져오는 법
function printUser2 ({username, password, name, email}) {
    console.log('사용자이름: ${username}');
    console.log('비밀번호: ${password}');
    console.log('이름: ${name}');
    console.log('이메일: ${email}');
}
function main() {
    const user = {
        username : "admin",
        password : "1234",
        name : "정상훈",
        email : "qwe@gmail.com"
    }
    printUser(user);
    printUser2(user);
    // const {username, password, name, email} = user; 구조분해
}
main();