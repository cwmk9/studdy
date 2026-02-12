window.onload = init;
function init() {
    bind()
}

/*
    잼선생님의 가르침
    정적 요소 (Static): HTML 파일에 처음부터 적혀 있는 버튼, 메뉴 등.

👉 해결책: bind() 함수 같은 곳에서 한 번만 이벤트를 걸어준다.

동적 요소 (Dynamic): '추가' 버튼을 눌러서 나중에 새로 생겨나는 리스트, 삭제 버튼 등.

👉 해결책: 1. 생성되는 시점에 이벤트를 걸어주거나 (del 버튼처럼) 2. 부모 요소에게 이벤트를 맡긴다
*/




function bind() {
    const text = document.querySelector('#text')//입력창
    const copy = document.querySelector('#copy')//추가버튼
    const all = document.querySelector('#all')//전체선택체크박스
    const each = document.querySelector('#each')//선택삭제버튼
    const error = document.querySelector('#error')//오류표시

    //선택 삭제 잼선생님이 위로 올려보래서 올려봄
    each.addEventListener('click', function () {
        const checkall = document.querySelectorAll('.checka')//클릭을 누른 순간에 몇개인지 확인해야해서 안에있어야함
        checkall.forEach(function (checked1) {
            if (checked1.checked) {
                checked1.parentNode.remove()
            }
        })
    })
    //전체선택
    all.addEventListener('change', function () {
        const checkall = document.querySelectorAll('.checka')
        checkall.forEach(function (check) {
            if (all.checked) {
                check.checked = true;
            } else if (!all.checked) {
                check.checked = false;
            }
        })
    })



    //추가
    copy.addEventListener('click', function () {

        if (text.value == '') {
            console.log(text.value)
            error.innerHTML = '추가할 사항을 입력해주세용'
            return;
        }

        error.innerHTML = ''
        const label = document.body.appendChild(document.createElement('label'))
        const check = document.createElement('input')
        const del = document.createElement('input')
        const br = document.createElement('br')
        check.className = 'checka'
        check.type = 'checkbox'
        del.type = 'button'
        del.value = '삭제'
        label.innerHTML = text.value//innerHTML은 다 덮어쓰기 때문에 먼저 나와야 함
        label.prepend(check)//innerHTML보다 브라우저화면상 앞에 나와야하기 때문에 prepend
        label.append(del)
        label.append(br)
        console.log(text.value)
        text.value = ''
        //삭제
        del.addEventListener('click', function () {
            label.remove()
        })
        //선택삭제 //기능은 하지만 데이터가 많아지면 에러가 발생할수있음
        // each.addEventListener('click', function () {
        //     if (check.checked) {
        //         label.remove()
        //     }
        // })

        check.addEventListener('click', function () {
            const checkall = document.querySelectorAll('.checka')
            flag = true;
            checkall.forEach(function (check1) {
                if (!check1.checked) {
                    all.checked = false;
                    flag = false;
                }
            })
            if (flag) {
                all.checked = true;
            }
        })
    })
    text.addEventListener('keydown', function (event) {
        if (event.key == 'Enter') {
            copy.click()
        }
    })

}