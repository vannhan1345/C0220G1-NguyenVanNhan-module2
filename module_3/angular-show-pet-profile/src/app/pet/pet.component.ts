import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pet',
  templateUrl: './pet.component.html',
  styleUrls: ['./pet.component.css']
})
export class PetComponent implements OnInit {
  name = '';
petName = 'thao nari';
  petImage = 'https://photo-2-baomoi.zadn.vn/w1000_r1/2020_05_11_180_35003158/7db462330770ee2eb761.jpg';
  forgot = true;
  constructor() { }
  updateName(event) {
    this.petName = event.target.value;
  }

  updateImage(event) {
    this.petImage = event.target.value;
  }
toggleForgot(){
    this.forgot = !this.forgot;
}
showEvent(event){
    this.name = event.target.value;
}

  ngOnInit(): void {
  }

}
