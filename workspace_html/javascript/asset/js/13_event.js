console.log('hello js')


const btn1 = document.querySelector('#btn1')
console.log(1, btn1)

function init() {
    const btn1 = document.querySelector('#btn1')
    console.log(2, btn1)

    const game = document.querySelector('#game')
    game.style.left = '10px'
    game.style.top = '300px'

    bind()
}
window.onload = init

function btn3click(){
    let log = document.querySelector('#console')
    log.innerHTML+='<br>버튼3클릭'
}

function bind(){
    let log = document.querySelector('#console')

    let btn1 = document.querySelector('#btn1')
    btn1.onclick = function(){
        log.innerHTML+='<br>버튼1클릭'
    }
    btn1.onclick = function(){
        log.innerHTML+='<br>버튼1클릭2'
    }
        

    btn2.addEventListener('click',function(){
        log.innerHTML+='<br>버튼2클릭'
        
        let btn2 = document.querySelector('#btn2')
    })
    btn2.addEventListener('click',function(){
        log.innerHTML+='<br>버튼2click'
        
        let btn2 = document.querySelector('#btn2')
    })

    // 로그인 버튼을 누렀을 때
    // 아이디와 비밀번호가 비어있지 않다면
    // 아이디,비밀번호 출력
    // 하나라도 비어있다면
    // 아이디는 필수 입니다
    // 비밀번호는 필수입니다 출력
    
    
    let login = document.querySelector('#login')
    login.addEventListener('click',function(){
        let id = document.querySelector('#id')
        let pw = document.querySelector('#pw')

        if(id.value.trim()!='' && pw.value.trim()!=''){
            log.innerHTML+=id.value+','+pw.value
        }else{
            if(id.value.trim() == ''){
                 log.innerHTML+='아이디는 필수입니다'
            }
            if(pw.value.trim() == ''){
                log.innerHTML+='비밀번호는 필수입니다'
            }
        }
  
    })

    document.querySelector('#id').addEventListener('keydown',function(){
        log.innerHTML += '<br>keydown 발생'
    })
    document.querySelector('#id').addEventListener('keyup',function(event){
        // 엔터를 누르면
        // "엔터 빵"
        log.innerHTML += '<br>keyup 발생'
        console.log(event)
        console.log(event.key)
        console.log(event.keyCode)
        
        console.log(event.shiftKey)
        console.log(event.ctrlKey)
        console.log(event.altKey)

        if(event.keyCode==13){ //엔터
            console.log('엔터 빵')
            log.innerHTML += '<br>엔터빵'

             document.querySelector('#pw').focus() //DOM에 focus 발생
             
        }
        if(event.ctrlKey == true && event.keyCode == 67){
            event.preventDefault()
            alert('복사할라고??')
        }
    })

     document.querySelector('#pw').addEventListener('keyup',function(event){
        if(event.keyCode==13){ //엔터
        document.querySelector('#login').click() // DOM에 click발생
        }
     })

    const btn4 = document.querySelector('#btn4')
    btn4.addEventListener('click', btn4click)
    // removeEventListener
    // 이벤트 제거
    // 단, 익명함수는 불가능
    btn4.removeEventListener('click', btn4click)

    document.querySelector('body').addEventListener('keyup',function (event){
        console.log('body event.Keycode :',event.keyCode)

        
        console.log('game.style.left:',game.style.left)
        if(event.keyCode == 39){ //오른쪽
            game.style.left = (parseInt(game.style.left) + 10) + 'px'
             game.style.top = (parseInt(game.style.top) - 10) + 'px' 
        } else if(event.keyCode == 37){ //왼쪽
            game.style.left = (parseInt(game.style.left) - 10) + 'px' 
            game.style.top = (parseInt(game.style.top) - 10) + 'px' 
        } else if(event.keyCode == 38){ //왼쪽
            game.style.top = (parseInt(game.style.top) - 10) + 'px' 
        } else if(event.keyCode == 40){ //왼쪽
            game.style.top = (parseInt(game.style.top) + 10) + 'px' 
        }

        

    })
    document.querySelector('body').addEventListener('keydown',function (event){
        console.log('body event.Keycode :',event.keyCode)

        
        console.log('game.style.left:',game.style.left)
       if(event.keyCode == 40){ //아래
            game.style.top = (parseInt(game.style.top) + 10) + 'px' 
        }

        

    })

    document.querySelector('#top').addEventListener('click',function (event){
        console.log(document.documentElement.scrollTop)
        document.documentElement.scrollTop=0
        window.scrollTo({
            top:0,
            behavior:'smooth'
        }) 

        // 계산 결과가 실시간으로 빠르게 반영되진 않는다
        // let top = document.documentElement.scrollTop
        // while(top > 0){
        //     document.documentElement.scrollTop -= 10
        //     top = document.documentElement.scrollTop
        // } 

        // 시간에 따라서 strTimeout 대량으로 만들어서
        // 부드럽게 보이길 예상하는
        // for(let i=document.documentElement.scrollTop; i>=0; i-=10){
        //     let delay = 2000-i
        //     setTimeout(function(){
        //         document.documentElement.scrollTop = i
        //     },delay) //  좋은방법은 아님
        // }
    })
    window.addEventListener('scroll',function(){
        console.log('window.scrollY:', window.scrollY)
    })

}

function btn4click(){
    const console= document.querySelector('#console')
    console.innerHTML += '<br>btn4 클릭'
}