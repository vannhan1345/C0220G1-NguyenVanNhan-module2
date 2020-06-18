import {Component, Input, OnInit} from '@angular/core';
import {timeout} from 'rxjs/operators';

@Component({
  selector: 'app-progress-bar',
  templateUrl: './progress-bar.component.html',
  styleUrls: ['./progress-bar.component.css']
})
export class ProgressBarComponent implements OnInit {
  a = 0;
  // @Input() backgroundColor = '#d9d9d9';
  // @Input() progressColor = '#4CAF50';
  @Input() width;

  constructor() {
  }

  move() {

    if (this.a === 0) {
      const elem = document.getElementById('myBar');
      this.a = 1;

      this.width = 1;
      const id = setInterval(() => {
        if (this.width >= 100) {
          clearInterval(id);
          this.a = 0;
        } else {
          this.width++;
          elem.style.width = this.width + '%';
        }
      }, 100);
    }
  }
  ngOnInit(): void {
  }

}
