<?php
class Person
{
    public $foods;
    public $songs;
    public function setFoods($array): void
    {
        $this->foods = $array;
    }

    public function getFoods(): array
    {
        return $this->foods;
    }
    public function setSongs($array): void
    {
        $this->songs = $array;
    }

    public function getSongs(): array
    {
        return $this->songs;
    }
}
