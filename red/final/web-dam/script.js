const getMobsButton = document.getElementById('getMobs');
getMobsButton.addEventListener('click', fetchInfo);

function fetchInfo() {
    fetch('http://localhost:25565/api-rest/mob/1')
        .then(response => response.json())
        .then(jsonObj => displayUi(jsonObj))
        .catch(() => alert('No se encuentra la api'));
}

function displayUi(mob) {
    const id = mob.id;

    const template = `
    <div>
    <h1 id="head">${id}</h1>
    </div>
    `
    console.log(template)
    // did this so I would avoid the process of having a refresh/update button
    templateZone = document.getElementById('resultado');
    templateZone.innerHTML = template;
}