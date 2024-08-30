let names = [ "정상훈", "정상일", "정상이" ];
console.log(names);

names = names.map(name => {return name + "님"});
// map -> [ "정상훈님", "정상일님", "정상이님" ]
console.log(names);

names = names.filter(name => {return name === "정상일님"});
// filter -> 검색하는 조건을 참이면 그대로 찾아줌
console.log(names);

names = names.filter(name => {return name !== "정상일님"});
// filter -> !== 검색하는 조건이 거짓이면 찾는거 빼고 찾아줌
console.log(names);

names = names.filter((name, index) => index !== 1);
console.log(names);