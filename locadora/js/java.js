document.addEventListener("DOMContentLoaded", function () {

    const imagemPrincipal = document.querySelector(".produto img");
    const miniaturas = document.querySelectorAll(".miniaturas img");

    miniaturas.forEach(mini => {
        mini.addEventListener("click", () => {
            imagemPrincipal.src = mini.src;
        });
    });

});
