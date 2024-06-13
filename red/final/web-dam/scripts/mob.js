const getMobsButton = document.getElementById('getMobs');
const getMobByIdButton = document.getElementById('getMobById');
const deleteMobByIdButton = document.getElementById('deleteMobById');
const postMob = document.getElementById('postMob');
let getMobByIdText = document.getElementById('idMob');
let deleteByIdText = document.getElementById('idMobDelete');
let nameMobText = document.getElementById('name');
let attackMobText = document.getElementById('baseAttack');
let healthMobText = document.getElementById('baseHealth');
let abilityMobText = document.getElementById('specialAbility');
let dropListMobText = document.getElementById('dropList');
let biomesMobText = document.getElementById('biomes');
getMobsButton.addEventListener('click', fetchInfoMobs);
getMobByIdButton.addEventListener('click', fetchInfoMob);
deleteMobByIdButton.addEventListener('click', fetchDeleteMob);
postMob.addEventListener('click', fetchPostMob);
const mobZone = document.getElementById('mob');
const mobsZone = document.getElementById('mobs');
const mobPostZone = document.getElementById('mobPosted');

function fetchInfoMobs() {
    let url = 'http://localhost:25565/api-rest/mob/';
    fetchGetUrl(url);
}
function fetchPostMob() {
    let url = 'http://localhost:25565/api-rest/mob/'
    fetchPostUrl(url);
}
function fetchDeleteMob(){
    let url = 'http://localhost:25565/api-rest/mob/'
    fetchDeleteUrl(url,deleteByIdText.value);
}
function fetchDeleteUrl(url,id){
    fetch(url+id, {
        method: "DELETE"
    })
}

function fetchPostUrl(url) {
    const items = dropListMobText.value.split(',');
    const biomesIds = biomesMobText.value.split(',');
    let dropListFormat = [];
    let biomesFormat = [];
    items.forEach(item => {
        dropListFormat.push({ id: item })
    });
    biomesIds.forEach(biome => {
        biomesFormat.push(parseInt(biome))
    });

    let response=fetch(url, {
        method: "POST",
        body: JSON.stringify({
            name: nameMobText.value,
            baseHealth: healthMobText.value,
            baseAttack: attackMobText.value,
            specialAbility: abilityMobText.value,
            dropList: dropListFormat,
            biomesIds: biomesFormat
        }),
        headers: {
            "Content-type": "application/json; charset=UTF-8"
        }
    });
    response.then(response => response.json()).then(jsonObj => displayMob(jsonObj,mobPostZone))
}

function fetchInfoMob() {
    let url = 'http://localhost:25565/api-rest/mob/' + getMobByIdText.value;
    fetchGetUrl(url);
}
function fetchGetUrl(url) {
    fetch(url)
        .then(response => response.json())
        .then(jsonObj => displayForType(jsonObj))
        .catch(() => alert('La respuesta no ha sido valida'));
}

function displayForType(object) {
    if (object.length > 1) {
        displayMobs(object)
    } else {
        displayMob(object,mobZone)
    }
}

function displayMobs(mobs) {
    let objects = ``
    mobs.forEach(mob => {
        let items = ``
        mob.dropList.forEach(item => {
            items += item.id + ",";
        })
        items = items.slice(0, -1);
        objects += `<tr>
        <td>${mob.id}</td>
        <td>${mob.name}</td>
        <td>${mob.baseHealth}</td>
        <td>${mob.baseAttack}</td>
        <td>${mob.specialAbility}</td>
        <td>${items}</td>
        <td>${mob.biomesIds}</td>
        </tr>`
    });
    const templateMobs = `
    <div>
    <table>
    <tr>
    <th>ID</th>
    <th>NAME</th>
    <th>HEALTH</th>
    <th>ATTACK</th>
    <th>ABILITY</th>
    <th>DROP LIST</th>
    <th>BIOMES</th>
    `+ objects + `
    </tr>
    </table>
    
    </div>
    `
    mobsZone.innerHTML = templateMobs;

}

function displayMob(mob,zone) {
    let items = ``
    mob.dropList.forEach(item => {
        items += item.id + ",";
    })
    items = items.slice(0, -1);

    let objects = `
    <tr>
        <td>${mob.id}</td>
        <td>${mob.name}</td>
        <td>${mob.baseHealth}</td>
        <td>${mob.baseAttack}</td>
        <td>${mob.specialAbility}</td>
        <td>${items}</td>
        <td>${mob.biomesIds}</td>
        </tr>
    `

    const templateMob = `
    <div>
    <table>
    <tr>
    <th>ID</th>
    <th>NAME</th>
    <th>HEALTH</th>
    <th>ATTACK</th>
    <th>ABILITY</th>
    <th>DROP LIST</th>
    <th>BIOMES</th>
    `+ objects + `
    </tr>
    </table>
    
    </div>
    `
    
    zone.innerHTML = templateMob;
}