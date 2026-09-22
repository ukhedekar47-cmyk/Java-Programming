const colors = [
    { name: "Light Blue", value: "#87CEEB" },
    { name: "Light Green", value: "#90EE90" },
    { name: "Lavender", value: "#E6E6FA" },
    { name: "Light Coral", value: "#F08080" },
    { name: "Light Yellow", value: "#FFFACD" },
    { name: "Light Pink", value: "#FFB6C1" }
];

let index = 0;

function changeBackgroundColor() {
    document.body.style.backgroundColor = colors[index].value;
    document.getElementById("colorName").textContent = colors[index].name;

    index++;

    if (index >= colors.length) {
        index = 0;
    }
}

setInterval(changeBackgroundColor, 5000);
