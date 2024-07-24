import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { TooltipModule } from 'ngx-bootstrap/tooltip';
import { AlertModule } from 'ngx-bootstrap/alert';
import { FormsModule } from '@angular/forms';
import { MeuFormModule } from './meu-form/meu-form.module';
import { InputPropetyComponent } from './input-propety/input-propety.component';
import { OutputPropertyComponent } from './output-property/output-property.component';

@NgModule({
  declarations: [
    AppComponent,
    DataBindingComponent,
    InputPropetyComponent,
    OutputPropertyComponent
  ],
  imports: [
    FormsModule,
    BrowserModule,
    AppRoutingModule,
    TooltipModule.forRoot(),
    AlertModule.forRoot(),
    MeuFormModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
