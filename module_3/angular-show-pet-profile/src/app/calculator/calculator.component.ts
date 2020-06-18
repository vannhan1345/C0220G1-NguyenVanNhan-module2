import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
  firstNumber: number;
  secondNumber: number;
  result: any;
  operate = '+';

  constructor() { }
  // changeFistNumber(value: number) {
  //   this.firstNumber = value;
  // }
  // changeSecondNumber(value: number) {
  //   this.secondNumber = value;
  // }
  changeOperate(value) {
    this.operate = value;
  }
  calculate(){
    switch (this.operate) {
      case '+': this.result = this.firstNumber + this.secondNumber;
                break;
      case '-': this.result = this.firstNumber - this.secondNumber;
                break;
      case '*': this.result = this.firstNumber * this.secondNumber;
                break;
      case '/': if (this.secondNumber === 0){
        this.result = 'ko the chia cho 0';
      }else {
        this.result = this.firstNumber / this.secondNumber;
      }
                break;

    }

  }

  ngOnInit(): void {
  }

}
