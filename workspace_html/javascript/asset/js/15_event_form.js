window.addEventListener('load', function () {

    const log = this.document.querySelector('#log')

    window.addEventListener('resize', function () {
        const w = window.innerWidth;
        const h = window.innerHeight;

        log.innerHTML = `<br>너비:${w},높이:${h}` + log.innerHTML
    })

    const id = document.querySelector('#id')
    id.addEventListener('focus', function () {
        id.style.backgroundColor = 'yellow';
    })

    id.addEventListener('blur', function () {
        id.style.backgroundColor = '';
    })

    // input text등이 변경될 때 마다
    id.addEventListener('input', function () {
        const r = parseInt(Math.random() * 256)
        const g = parseInt(Math.random() * 256)
        const b = parseInt(Math.random() * 256)
        const a = Math.random()


        id.style.backgroundColor = `rgba(${r},${g},${b},${a})`;
    })
    const form = document.querySelector('#form')
    const site = document.querySelector('#site')
    site.addEventListener('change', () => {
        console.log(site.value)
        const form = this.document.querySelector('#form')

        if (site.value == 1) {
            site.form.setAttribute('action', 'https://search.naver.com/search.naver')
        } else if (site.value == 2) {
            site.form.setAttribute('action', 'https://www.google.com/search')
        }
    })
    form.addEventListener('submit', function (event) {

        // html 태그의 고유(기본) 기능을 막아준다
        // 여기서는 submit의 기능을 막음
        event.preventDefault()

        // 검색어가 두글자 이하면
        if (id.value.length <= 2) {
            alert('검색어는 두글자 이상입니다')
            // event.preventDefault()//이방법은 고유기능이 먼저 작동하면 뚫림
        } else {
            form.submit()
        }
    })

    addEventListener('copy', function (event) {
        event.preventDefault()
        this.alert('복사금지')
    })

    addEventListener('selectstart', function (event) {
        event.preventDefault()
    })
    document.querySelector('#parent')
        .addEventListener('click', function (event) {
            console.log('부모 클릭')

            // event.target : 실제 이벤트가 발생한 DOM
            console.log('event.target :', event.target)

            // event.currentTarget : 이벤트가 적용되어 있는 DOM
            console.log('event.currentTarget :', event.currentTarget)

            // 이벤트안에서의 this는 event.currentTarget
            console.log('this :', this)
            console.log('this? :', this === event.currentTarget)
            // arrow 함수인 경우 this를 변경하지 않음
            // 즉 this === window

            // },true)
        })
    document.querySelector('#child1')
        .addEventListener('click', function (event) {
            // 전파 방지
            // 부모로 전달되는 이벤트 중지
            // event.stopPropagation()//타겟연습때문에 주석
            console.log('자식1 클릭')
        })


    // 같이 해보자
    // 1.table 태그에 click 이벤트 주기
    // 2.click된 dom을 출력
    // 3.DOM.classList.contains('chk')로
    // 4.checkbox일 경우만 value 출력
    // this.document.querySelector('#board')
    // .addEventListener('click',function(){
    //     // console.log(event.target)
    //     // let chk = document.classList.contains('.chk')
    //     // if(chk == true){
    //     //     console.log(value)
    //     // } 틀림

    //     if(event.target.classList.contains('chk')){
    //         console.log(event.target.value)
    //     }

    //     // 5. 제목을 클릭 했을 때만 내용을 출력
    //      if(event.target.classList.contains('title')){
    //         console.log(event.target.innerText)
    //     }
    // })
    // 6. 이제 table에 위임하지 않고 
    // tr에 위임하게 해주세요
    // css 선택자 '#board tr'
    const trs = document.querySelectorAll('#board tr')
    for (let i = 0; i < trs.length; i++) {
        trs[i].addEventListener('click', function () {
            let chk = event.target.classList.contains('chk')
            // 7. 무조건 제목의 내용이 출력되게
            // if(event.target.classList.contains('board')){
            //     console.log(event.currentTarget.innerText)
            // }
            // console.log(event.currentTarget.querySelector('.title').innerText)

            // 8.체크박스를 클리했을때만 제목이 안나오게
            if (!chk) {
                console.log(event.currentTarget.querySelector('.title').innerText)

            }
        })
        trs[i].querySelector('input.chk')
            .addEventListener('click', function (event) {
                event.stopPropagation()
                // 부모로 이동
                console.log("this.parentNode:", this.parentNode)
                console.log("this.parentNode.parentNode:", this.parentNode.parentNode)
                //9.체크박스를 클릭했을 때 그 중의 제목을 출력
                console.log(this.parentNode.parentNode.querySelector('.title').innerText)
            })
            
    }
})


//밖에서의 this는 window
console.log('밖에서 this :', this)
console.log('밖에서 window :', this === window)