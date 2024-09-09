import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Salle } from '../salle';
import { SalleService } from '../salle.service';

@Component({
  selector: 'app-create-salle',
  templateUrl: './create-salle.component.html',
  styleUrls: ['./create-salle.component.css']
})
export class CreateSalleComponent implements OnInit {
  salle:Salle =new Salle();

  constructor(private salleService:SalleService,private router:Router) { }

  ngOnInit(): void {
  }
  public savesalle(){
    this.salleService.CreateSalle(this.salle).subscribe(data =>{
      console.log(data);
      this.gotosalle();
    },
    error => console.log(error)
    );
    
  }
  gotosalle(){
    this.router.navigate(['/salles']);
  }
  onSubmit(){
    console.log(this.salle);
    this.savesalle();

  }

}
