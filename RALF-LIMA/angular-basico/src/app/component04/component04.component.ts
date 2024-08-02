import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-component04',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './component04.component.html',
  styleUrl: './component04.component.css'
})
export class Component04Component {

  exibir: boolean = false;

  acao(){
    if(this.exibir === true){
      this.exibir = false;
    }else{
      this.exibir = true;
    }
  }

}
