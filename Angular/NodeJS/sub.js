var addFoo=require("./add.js");
var anotherAddFoo=require("./AnotherAdd.js");

function sub(){
    return 30-20;
}

console.log("Sub :"+sub());
console.log("add in sub js :"+addFoo());
console.log("Anotheradd in sub js :"+anotherAddFoo());