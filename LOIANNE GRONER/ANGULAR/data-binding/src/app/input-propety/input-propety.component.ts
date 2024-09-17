import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-curso',
  templateUrl: './input-propety.component.html',
  styleUrl: './input-propety.component.css',
  // inputs: ['nomeCurso:nome']
})
export class InputPropetyComponent implements OnInit{

  @Input('nome') nomeCurso: string = '';

  constructor(){}
  ngOnInit(){
  }
}
