import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrl: './data-binding.component.css'
})
export class DataBindingComponent implements OnInit{

  url: string = 'http://loiane.com';
  imagemUrl = 'https://picsum.photos/200/300';

  valorAtual: string='';
  valorSalvo ='';
  isMouseOver: boolean = false;
  



  getValor(){
    return 1;
  }

  cursoAngular: boolean = true;

  getCurtirCurso(){
    return true;
  }

  botaoClicado(){
    alert("clicou no botão!");

  }

  onKeyUp(evento: KeyboardEvent){
    this.valorAtual = (<HTMLInputElement>evento.target).value;

  }

  salvarValor(valor: string){
    this.valorSalvo = valor;
  }

  onMouseOverOut(){
    this.isMouseOver = !this.isMouseOver;
  }

  constructor(){}

  ngOnInit(): void {

  }
}

