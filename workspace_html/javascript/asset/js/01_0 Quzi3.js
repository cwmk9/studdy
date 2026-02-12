window.onload = init;
function init() {
    const wow = document.querySelector('#wow')
    bind()
}
function bind() {
    const roddo = document.querySelector('#roddo')
    roddo.addEventListener('click', function () {
        {
            const good = []

            let flag = false
            while (good.length < 6) {
                let r = Math.floor((Math.random() * 45) + 1);
                flag = false
                for (let a = 0; a < good.length; a++) {
                    if (good[a] == r) {
                        flag = true
                        break;
                    }
                }
                if (!flag) {
                    good.push(r)
                    wow.innerHTML = good
                }
            }
        }
    })



    document.querySelector('html')
        .addEventListener('contextmenu', function (evt) {
            const square = document.querySelector('#square')
            evt.preventDefault()
            square.style.left = evt.offsetX +100+ 'px'
            square.style.top = evt.offsetY +100+ 'px'
            square.style.display = "block"
        })

    document.querySelector('html')
        .addEventListener('click', function () {
            const square = document.querySelector('#square')
            square.style.display = "none"
        })

    let h = document.querySelector('html')
    h.addEventListener('contextmenu', function (evt) {
        let box = document.querySelector('#box')
        evt.preventDefault()
        box.style.display = 'block'
        box.style.left = evt.offsetX + 'px'
        box.style.top = evt.offsetY + 'px'
    })
    h.addEventListener('click', function () {
        let box = document.querySelector('#box')
        box.style.display = 'none'
    })
}

