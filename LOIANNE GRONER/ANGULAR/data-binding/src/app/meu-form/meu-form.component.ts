import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-meu-form',
  templateUrl: './meu-form.component.html',
  styleUrl: './meu-form.component.css'
})
export class MeuFormComponent implements OnInit{

  nome: string = 'abc';

  pessoa: any = {
    nome: 'def',
    idade: 23
  }

  constructor(){}
  ngOnInit(){}

}
