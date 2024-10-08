import { Component, ElementRef, EventEmitter, Input, OnInit, Output, ViewChild } from '@angular/core';

@Component({
  selector: 'contador',
  templateUrl: './output-property.component.html',
  styleUrl: './output-property.component.css'
})
export class OutputPropertyComponent implements OnInit{

  @Input() valor: number = 0;

  @Output() mudouValor = new EventEmitter();

  @ViewChild('campoInput') campoValorInput!: ElementRef;

  incrementa(){
    console.log(this.campoValorInput.nativeElement.value++);
    // this.valor++
    this.mudouValor.emit({novoValor: this.valor})
  }

  decrementa(){
    // this.valor--
    console.log(this.campoValorInput.nativeElement.value--);
    this.mudouValor.emit({novoValor: this.valor})
  }

  constructor(){}
  ngOnInit(): void {

  }

}
