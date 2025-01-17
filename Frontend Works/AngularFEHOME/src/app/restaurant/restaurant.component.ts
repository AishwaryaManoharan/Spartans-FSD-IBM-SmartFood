import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-restaurant',
  templateUrl: './restaurant.component.html',
  styleUrls: ['./restaurant.component.css']
})
export class RestaurantComponent implements OnInit {
  restaurantList: restaurantResponse[]
  constructor() { }

  ngOnInit() {  

    this.restaurantList = [
      {  
        name: "Dominos",
	     contact: 9424326751,
     	rating: 4.9,
    	location: "Nagawara",
      co_ordinates: "1,2",
      resId: "1234567",
      imageUrl: "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Domino%27s_pizza_logo.svg/1200px-Domino%27s_pizza_logo.svg.png",

      },
      {
        name: "Pizza Hut",
        contact: 9424326751,
        rating: 4,
       location: "White Field",
       co_ordinates: "1,2",
       resId: "12567",
       imageUrl: "https://cms.groupeditors.com/img/3057b75c-eb10-4e4e-a973-cde552d10a42.jpg",
 
        },
      {
        name: "Truffles",
        contact: 7415548497,
        rating: 2,
       location: "Yehlanka",
       co_ordinates: "1,2",
       resId: "12567",
       imageUrl: "https://pbs.twimg.com/profile_images/967052158876160001/lo66hJ12_400x400.jpg",
   }
    ]
  }

}

export interface restauratRequest
{
  name: string;
	contact:number;
	rating: number;
	location: string;
  co_ordinates: string;
}

export interface restaurantResponse
{
  name: string;
	contact:number;
	rating: number;
	location: string;
  co_ordinates: string;
  resId: string;
  imageUrl: string; 

}