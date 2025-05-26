//* Print Duplicate elements an array

//todo Steps:
// 1. Create an array = array1.
// 2. Create an empty array = result.
// 3. Iterate each element of array1 with Loop.
// 4. Check if the element is present in that array1.
// 5. If it is present, push that element to the result array.
// 6. Print the result array.












let arr = [2,4,1,8,3,7,10,6,4,11,8,8,10,10,11];
// let result = [];  
let result = new Set();        

for (let i = 0; i < arr.length; i++) {
  for (let j=0; j < arr.length; j++){
    if (arr[i]==arr[j] && (i!=j)) {
    //  result[index] = arr[i];
     result.add(arr[i]);
    } 
  }   
}
// for(let i=0;i<result.length;i++){
//     process.stdout.write(result[i] + " ,");
// }

console.log(result);