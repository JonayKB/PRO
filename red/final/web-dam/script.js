const getMobsButton = document.getElementById('getMobs');
getMobsButton.addEventListener('click', fetchInfo);

function fetchInfo() {
    fetch('http://localhost:25565/api-rest/mob/')
        .then(response => response.json())
        .then(jsonObj => displayUi(jsonObj))
        .catch(() => alert('La respuesta no ha sido validad'));
}

function displayUi(mobs) {
    const id = mobs[0].id;
    const name = mobs[0].name;
    const health = mobs[0].baseHealth;
    const attack = mobs[0].baseAttack;
    const specialAbility = mobs[0].specialAbility;
    const dropList = mobs[0].dropList;
    const biomesIds = mobs[0].biomesIds;
    const template = `
    <div>
    <h1 id="head">ID: ${id}</h1>
    <h3 id="attribute">NAME: ${name}</h3>
    <h3 id="attribute">HEALTH: ${health}</h3>
    <h3 id="attribute">ATTACK: ${attack}</h3>
    <h3 id="attribute">SPECIAL ABILITY: ${specialAbility}</h3>
    <h3 id="attribute">DROP LIST: ${dropList[0].name}</h3>
    <h3 id="attribute">BIOME LIST: ${biomesIds}</h3>
    
    </div>
    `
    console.log(template)
    // did this so I would avoid the process of having a refresh/update button
    const templateZone = document.getElementById('resultado');
    templateZone.innerHTML = template;
}