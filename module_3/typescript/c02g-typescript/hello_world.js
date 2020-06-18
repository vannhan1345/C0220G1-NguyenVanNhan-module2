// let a = 3;
// let b = a + 1;
//
// console.log(b);
//
// let c: any = 3;
// let d: any = 4;
//
// console.log(c + d);
// interface IStudent {
//     id: number,
//     name: string
// }
//
// let user1: IStudent = {id: 123, name: 'Tien'};
//
// console.log(user1.name + ' ' + user1.id);
//
// let a: string = 'abc';
// function sum(a: number, b: number) : number {
//     return a + b;
// }
//
// console.log(sum(3, 7));
// let arrayInt : Array<number> = [3, 2, 1, 5];
let arrayInt = [3, 2, 1, 5];
// for (let value of arrayInt) {
//     console.log(value);
// }
// arrayInt.forEach(element => {
//     console.log(element);
// });
// arrayInt.forEach(function(element) {
//     console.log(element);
// });
let responseAPI = false;
// @ts-ignore
let testPromise = new Promise(function (resolve, reject) {
    if (responseAPI) {
        resolve("Da thuc hien loi hua");
    }
    else {
        reject("Khong thuc hien loi hua");
    }
});
testPromise.then(function (msg) {
    console.log("Nhan pham +1 " + msg);
}, function (msgError) {
    console.log("Nhan pham -1 " + msgError);
});
//# sourceMappingURL=hello_world.js.map