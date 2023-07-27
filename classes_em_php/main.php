<?php
require_once "Person.php";

$qttck = new Person;

$qttck->setFoods(
    [
        "Estrogonofe",
        "Pizza",
        "Snickers",
        "Energético",
    ]
);

$qttck->setSongs(
    [
        "Lo-Fi",
        "Rock",
        "Dark Techno",
        "Synthwave"
    ]
);

print_r($qttck->getFoods());
print_r($qttck->getSongs());
