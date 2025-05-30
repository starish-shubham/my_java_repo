let index = 5;
let jx = 2;

test(index,jx);

function test(index1,jx1){
    for (let i = 0; i < index; i++) {
        for (let j = 0; j < jx; j++) {
            process.stdout.write(i + " : " + j + "\n ");   
        }
    }
}
