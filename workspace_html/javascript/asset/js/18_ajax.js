window.addEventListener('load',bind);


function bind(){
    const btn1 = document.querySelector('#btn1')
    btn1.addEventListener('click',function(){

        // ajax 객체 생성
        const xhr = new XMLHttpRequest();

        // 보낼 준비
        // method, 주소
        xhr.open('get','https://jsonplaceholder.typicode.com/users')

        // 보내기
        xhr.send()
        console.log(xhr.responseText) //데이터를 가지러 갔지만 아직 가져오지는못한상태

        xhr.onload = function(){
            console.log('다녀왔엉')
            console.log(xhr.responseText) //데이터를 가져와서 로딩이끝난상태
            const xhr2= JSON.parse(xhr.responseText)
            console.log(xhr2)
            
            console.log(xhr2[1].name)
            console.log(xhr2[2].address.geo.lat)
        
        }

    })
}