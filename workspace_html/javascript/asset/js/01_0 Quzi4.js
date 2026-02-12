window.onload = init;
function init() {

    const login = document.querySelector('#login')
    bind()
}

function bind() {
    //문제1
    login.addEventListener('click', function () {
        const id = document.querySelector('#id')
        const pw = document.querySelector('#pw')
        const div = document.querySelector('#div')


        if (id.value.trim() == '') {
            div.style.display = "block"
            div.style.color = "red"
            div.innerHTML = "아이디를 입력해주세요"
        } else if (pw.value.trim() == '') {
            div.style.display = "block"
            div.style.color = "red"
            div.innerHTML = "비밀번호를 입력해주세요"
        }
        if (id.value.trim() !== '' && pw.value.trim() !== '') {
            div.style.display = "none"
        }
        console.log(id.value)
    })
    //문제2
    const btn = document.querySelector('#btn')
    btn.addEventListener('click', function (event) {
        const pizza = document.querySelector('#pizza')
        const size = document.querySelectorAll('.size:checked')
        const crust = document.querySelector('#crust')
        const topping = document.querySelectorAll('.topping:checked')
        const money = document.querySelector('#money')
        const money1 = document.querySelector('#money1')


        console.log(pizza.value)
        let size1 = 0
        for (let i = 0; i < size.length; i++) {
            size1 += Number(size[i].value)
        }
        console.log(size1)
        let size2 = ''
        for (let a = 0; a < size.length; a++) {
            size2 = size[a].parentNode.textContent.trim() + ''
        }
        console.log(size2)
        let topping1 = 0
        for (let i = 0; i < topping.length; i++) {
            topping1 += Number(topping[i].value)
        }
        console.log(topping1)
        let topping2 = ''
        for (let a = 0; a < topping.length; a++) {
            topping2 += topping[a].parentNode.textContent.trim() + ''
        }
        console.log(topping2)
        console.log(crust.value)

        let money2 = money.innerHTML = '총액:' + (parseInt(size1) + parseInt(topping1))
        money1.innerHTML += '영수증:' + pizza.value + ',' + size2 + ',' + crust.value + ',' + topping2 + ',' + money2
    })
    //문제3
    const copy = document.querySelector('#copy')
    copy.addEventListener('click', function () {
        const order = document.querySelector('#order')
        const delivery = document.querySelector('#delivery')
        const order1 = document.querySelector('#order1')
        const delivery1 = document.querySelector('#delivery1')
        const div1 = document.querySelector('#div1')
        if (order.value.trim() == '') {
            div1.innerHTML = "주소를 입력해주세용"
        } else if (delivery.value.trim() == '') {
            div1.innerHTML = "배송지를 입력해주세용"
        }
        if (order.value.trim() != '' && delivery.value.trim() != '') {
            order1.value = order.value.trim()
            delivery1.value = delivery.value.trim()
        }
        if (!copy.checked) {
            order1.value = ''
            delivery1.value = ''

        }

    })
    //문제4
    menu()
    function menu() {
        const best = document.querySelectorAll('.best')
         for (let i = 0; i < best.length; i++) {
        best[i].addEventListener('change', function () {
            // for (let i = 0; i < best.length; i++) {
                for(let a=0; a<best.length; a++){
                        best[a].checked=false
                        best[a].parentNode.style.fontWeight = 'normal'
                }
                best[i].checked=true;
                best[i].parentNode.style.fontWeight = '900'
            })
    }
        // const low = document.querySelector('#low')
        // low.addEventListener('change', function () {
        //     if (low.checked) {
        //         low.parentNode.style.fontWeight = '1000'
        //     }if(!low.checked){
        //          low.parentNode.style.fontWeight = 'normal'
        //     }
        // })
        // const high = document.querySelector('#high')
        // high.addEventListener('change', function () {
        //     if (high.checked) {
        //         high.parentNode.style.fontWeight = '1000'
        //     }else if(!high.checked){
        //          high.parentNode.style.fontWeight = 'normal'
        //     }
        // })
        // const new1 = document.querySelector('#new')
        // new1.addEventListener('click', function () {
        //     if (new1.checked) {
        //         new1.parentNode.style.fontWeight = '1000'
        //     }else if(!new1.checked){
        //          new1.parentNode.style.fontWeight = 'normal'
        //     }
        // })
    //문제5
        let img = document.querySelector('#img')
        img.addEventListener('mouseover',function(){
            let src1=document.querySelector('.src')
            let src2=document.querySelector('.src1')
            src2.src="https://thumbnail.coupangcdn.com/thumbnails/remote/492x492ex/image/retail/images/62621390599368-d6218442-ebe5-4765-b74e-b3b7c05d4adb.jpg"
            src2.style.display='inline-block'
            src1.style.display='inline-block'
            src1.style.verticalAlign='top'
            })
        img.addEventListener('mouseout',function(){
            let src1=document.querySelector('.src')
            let src2=document.querySelector('.src1')
            src2.src=""
           
        })
    }


}