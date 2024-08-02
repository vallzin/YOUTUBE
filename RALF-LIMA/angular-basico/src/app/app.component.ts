import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';

import { Component01Component } from "./component01/component01.component";
import { Component02Component } from "./component02/component02.component";
import { Component03Component } from "./component03/component03.component";
import { Component04Component } from "./component04/component04.component";
import { Component05Component } from "./component05/component05.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, Component01Component, Component02Component, Component03Component, Component04Component, Component05Component],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'angular-basico';
}
