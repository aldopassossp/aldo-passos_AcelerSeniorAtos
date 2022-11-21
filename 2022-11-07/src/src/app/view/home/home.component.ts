import { Router, Routes } from '@angular/router';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {


  constructor(private routes: Router) { }

  ngOnInit(): void {
  }

  adicionar(): void{
    this.routes.navigate(['pessoa/adicionar'])
  }

}
