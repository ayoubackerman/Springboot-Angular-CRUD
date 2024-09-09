import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
//import { error } from 'console';
import { Salle } from '../salle';
import { SalleService } from '../salle.service';
import { UpdateSalleComponent } from '../update-salle/update-salle.component';
//import { Console } from 'console';


@Component({
  selector: 'app-salle-list',
  templateUrl: './salle-list.component.html',
  styleUrls: ['./salle-list.component.css']
})
export class SalleListComponent implements OnInit {
  Salles!: Salle[];
  id!: number;

  constructor(private salleService:SalleService,private router:Router, private route:Router) { }

  ngOnInit(): void {
    this.getSalles();

    

  }
  public getSalles(){
    this.salleService.getSallesList().subscribe(data =>{
      this.Salles=data;
    },
   /* (error:HttpErrorResponse)=>{
      alert(error.message);
    
    }*/
    );
   
  }
  updatesalle(id:number){
    this.router.navigate(['update-salle',id]);

  }
  reloadCurrentPage() {
    window.location.reload();
   }
  gotosalle(){
    this.router.navigate(['/salles']);
  }
  deletesalle(id:number){
    
    this.salleService.deletesalle(id).subscribe(data=>{

      this.gotosalle();
      
    })

  }

}
